# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package is single manager for a Dynamixel.     It provides a terminal envir"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "catkin-native dynamixel-sdk dynamixel-workbench-msgs dynamixel-workbench-toolbox roscpp"
SRC_URI = "https://github.com/ROBOTIS-GIT-release/dynamixel-workbench-release/archive/release/kinetic/dynamixel_workbench_single_manager/0.1.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e2242f9393a822f33158b09c46b9bae0"
SRC_URI[sha256sum] = "47714bea16fcff52368769a836a321b7fd552381219905a58ffb429952383301"
S = "${WORKDIR}/dynamixel-workbench-release-release-kinetic-dynamixel_workbench_single_manager-0.1.9-0"

inherit catkin
