# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This packagae implements the special homing procedure that is needed for old cob"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=b691248d2f70cdaeeaf13696ada5d47c"

DEPENDS = "canopen-402 catkin-native class-loader"
SRC_URI = "https://github.com/ipa320/cob_driver-release/archive/release/kinetic/cob_elmo_homing/0.6.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6f44b6033200156af17525a10c1c89c1"
SRC_URI[sha256sum] = "5554aad19b4ae8f853239b15fc17f91f247fedc0c56aa7dae5ffb312eb529eb1"
S = "${WORKDIR}/cob_driver-release-release-kinetic-cob_elmo_homing-0.6.10-0"

inherit catkin
