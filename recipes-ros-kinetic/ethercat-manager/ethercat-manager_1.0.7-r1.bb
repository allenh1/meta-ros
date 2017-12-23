# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS-Industrial support stack for facilitating communication with EtherCAT networ"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native roscpp soem"
SRC_URI = "https://github.com/tork-a/minas-release/archive/release/kinetic/ethercat_manager/1.0.7-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "20e8512a6f2f78c04310ee7cee47e5cd"
SRC_URI[sha256sum] = "637b2734af5e109a6479ccce3a8ae9b3b0e9cd05f912b0727436a6f21f68a720"
S = "${WORKDIR}/minas-release-release-kinetic-ethercat_manager-1.0.7-1"

inherit catkin
