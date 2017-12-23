# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Driver package for interfacing the battery management system (BMS) on Care-O-bot"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native cob-msgs cob-srvs diagnostic-msgs diagnostic-updater python-numpy roscpp rospy socketcan-interface std-msgs"
SRC_URI = "https://github.com/ipa320/cob_driver-release/archive/release/kinetic/cob_bms_driver/0.6.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f034e55a585ff147c5cfdcc77a8e1be2"
SRC_URI[sha256sum] = "547684e48d0616d3c00c0b8febfe5764d86978792dd086c454af5598334bad94"
S = "${WORKDIR}/cob_driver-release-release-kinetic-cob_bms_driver-0.6.10-0"

inherit catkin
