# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package is a set of messages and services for using thormang3_feet_ft_modul"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/ROBOTIS-GIT-release/ROBOTIS-THORMANG-msgs-release/archive/release/kinetic/thormang3_feet_ft_module_msgs/0.2.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5d3f2124cab6b2c006edede7f05df698"
SRC_URI[sha256sum] = "654b69a0670d2fcb841a5c68afebc2880614f7873e85fd0b07496c264b71a3ab"
S = "${WORKDIR}/ROBOTIS-THORMANG-msgs-release-release-kinetic-thormang3_feet_ft_module_msgs-0.2.2-0"

inherit catkin
