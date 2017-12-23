# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains classes that are able to control the platform of the Care-"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native cob-canopen-motor cob-generic-can cob-utilities control-msgs diagnostic-msgs message-generation message-runtime roscpp sensor-msgs std-msgs std-srvs"
SRC_URI = "https://github.com/ipa320/cob_driver-release/archive/release/kinetic/cob_base_drive_chain/0.6.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "cd2d6bef8739c0145d91d77674804e23"
SRC_URI[sha256sum] = "687b6c5714d4b8b1fdd2f285d4f96fed9546021fb559ebd88a31dd03df33996d"
S = "${WORKDIR}/cob_driver-release-release-kinetic-cob_base_drive_chain-0.6.10-0"

inherit catkin
