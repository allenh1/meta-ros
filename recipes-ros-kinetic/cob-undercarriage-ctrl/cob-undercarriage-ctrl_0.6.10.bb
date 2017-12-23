# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "cob_undercarriage_ctrl implements a controller for the omnidirectional base of C"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native cob-msgs cob-utilities control-msgs diagnostic-msgs diagnostic-updater geometry-msgs nav-msgs roscpp tf"
SRC_URI = "https://github.com/ipa320/cob_driver-release/archive/release/kinetic/cob_undercarriage_ctrl/0.6.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "76ad65e12e74ec853d428269972c39ba"
SRC_URI[sha256sum] = "0e2af07f6fc066d86ab094d650d499a3dccc848e3c861b1b9de867064c376a7b"
S = "${WORKDIR}/cob_driver-release-release-kinetic-cob_undercarriage_ctrl-0.6.10-0"

inherit catkin
