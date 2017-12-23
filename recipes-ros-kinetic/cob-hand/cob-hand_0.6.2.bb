# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The cob_hand stack includes packages that provide access to the Care-O-bot hand "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native cob-hand-bridge"
SRC_URI = "https://github.com/ipa320/cob_hand-release/archive/release/kinetic/cob_hand/0.6.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5f3efaa9033e1e2793397d7abe0d9db4"
SRC_URI[sha256sum] = "0e94cca21ac9862b035de1d98a746e5231ca07186c8a2277a4e7c5326ad60005"
S = "${WORKDIR}/cob_hand-release-release-kinetic-cob_hand-0.6.2-0"

inherit catkin
