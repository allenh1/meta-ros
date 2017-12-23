# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "MoveIt interface to OMPL"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native dynamic-reconfigure eigen-conversions moveit-core moveit-ros-planning ompl pluginlib roscpp tf"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/lunar/moveit_planners_ompl/0.9.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4194f25b8aecf876a8f674dc7693984d"
SRC_URI[sha256sum] = "56ee98f79d4747ee03c978b61e9f2c90695c9eaf61753f23f9cb198332178022"
S = "${WORKDIR}/moveit-release-release-lunar-moveit_planners_ompl-0.9.9-0"

inherit catkin
