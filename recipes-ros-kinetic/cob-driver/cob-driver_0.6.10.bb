# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The cob_driver stack includes packages that provide access to the Care-O-bot har"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native cob-base-drive-chain cob-bms-driver cob-camera-sensors cob-canopen-motor cob-elmo-homing cob-generic-can cob-head-axis cob-light cob-mimic cob-phidgets cob-relayboard cob-scan-unifier cob-sick-lms1xx cob-sick-s300 cob-sound cob-undercarriage-ctrl cob-utilities cob-voltage-control"
SRC_URI = "https://github.com/ipa320/cob_driver-release/archive/release/kinetic/cob_driver/0.6.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8eb815bafcd39b32890f25383a802c95"
SRC_URI[sha256sum] = "1c34a79d8cbacfa469cf9ad3615ed907e523532b8b29ea061c1686bd941e36ea"
S = "${WORKDIR}/cob_driver-release-release-kinetic-cob_driver-0.6.10-0"

inherit catkin
