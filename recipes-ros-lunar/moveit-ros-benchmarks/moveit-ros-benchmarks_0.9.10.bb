# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Enhanced tools for benchmarks in MoveIt!"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin moveit-ros-planning moveit-ros-warehouse pluginlib roscpp"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/lunar/moveit_ros_benchmarks/0.9.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a4af20eef9816d6e0143776b1c53eca1"
SRC_URI[sha256sum] = "d684c602645d8dc1574d7a81766928dd1d2e302da7ebcebfb0fe051393ed7afc"
S = "${WORKDIR}/moveit-release-release-lunar-moveit_ros_benchmarks-0.9.10-0"

inherit catkin
