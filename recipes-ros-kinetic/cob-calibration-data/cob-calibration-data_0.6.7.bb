# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This repository holds the current calibration data for Care-O-bot."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native cob-supported-robots xacro"
SRC_URI = "https://github.com/ipa320/cob_calibration_data-release/archive/release/kinetic/cob_calibration_data/0.6.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c9e3b5790e66316428a50944c7755f35"
SRC_URI[sha256sum] = "16fe4bd3935b58f8bb3abd21dd7242853fd141d0129abd50586c6b1e63a95732"
S = "${WORKDIR}/cob_calibration_data-release-release-kinetic-cob_calibration_data-0.6.7-0"

inherit catkin
