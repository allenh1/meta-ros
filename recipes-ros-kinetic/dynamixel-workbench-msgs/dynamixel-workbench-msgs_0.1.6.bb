# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "dynamixel_workbench_msgs package     This package includes ROS messages and serv"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-generation std-msgs"
SRC_URI = "https://github.com/ROBOTIS-GIT-release/${PN}-release/archive/release/kinetic/dynamixel_workbench_msgs/0.1.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "42fb831514a6580cfc13f1b845c1206f"
SRC_URI[sha256sum] = "e453d83f5770aa8cfc1952a23a5af910ea0efa05ef5ddf51b628de736029bcf1"
S = "${WORKDIR}/${PN}-release-release-kinetic-dynamixel_workbench_msgs-0.1.6-0"

inherit catkin
