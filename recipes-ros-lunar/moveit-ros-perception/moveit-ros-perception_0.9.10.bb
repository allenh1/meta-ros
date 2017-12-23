# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Components of MoveIt connecting to perception"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cv-bridge eigen glut image-transport libglew-dev message-filters moveit-core moveit-msgs octomap opengl pluginlib rosconsole roscpp sensor-msgs tf tf-conversions urdf"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/lunar/moveit_ros_perception/0.9.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "356096285b73e45dfb9fcac7e17efede"
SRC_URI[sha256sum] = "07f0c620879f0e9748bfffbc10e9babc97f83013d9dc20e2c556b367df202837"
S = "${WORKDIR}/moveit-release-release-lunar-moveit_ros_perception-0.9.10-0"

inherit catkin
