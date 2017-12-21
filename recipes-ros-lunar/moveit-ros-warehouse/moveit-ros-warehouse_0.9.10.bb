# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Components of MoveIt connecting to MongoDB"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native moveit-ros-planning rosconsole roscpp tf warehouse-ros"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/lunar/moveit_ros_warehouse/0.9.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7465478427d40b48fa126148f50476fe"
SRC_URI[sha256sum] = "16c0c2ebfcb0a6696fa71989803b852204ea87db1eba870bf084ac30888a5910"
S = "${WORKDIR}/moveit-release-release-lunar-moveit_ros_warehouse-0.9.10-0"

inherit catkin
