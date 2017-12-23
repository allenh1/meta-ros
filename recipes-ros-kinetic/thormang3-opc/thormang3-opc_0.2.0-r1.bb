# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS packages for the thormang3_opc (meta package)"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native thormang3-action-script-player thormang3-foot-step-generator thormang3-offset-tuner-client"
SRC_URI = "https://github.com/ROBOTIS-GIT-release/ROBOTIS-THORMANG-OPC-release/archive/release/kinetic/thormang3_opc/0.2.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "bcd708ed37e842a8bb08809f071400e6"
SRC_URI[sha256sum] = "2e725f1c68f1f9d35ab3fcda24798134bfece8e7a94077fd38b16e7c5114e478"
S = "${WORKDIR}/ROBOTIS-THORMANG-OPC-release-release-kinetic-thormang3_opc-0.2.0-1"

inherit catkin
