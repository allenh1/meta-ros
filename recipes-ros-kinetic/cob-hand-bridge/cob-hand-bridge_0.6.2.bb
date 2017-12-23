# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The cob_hand_bridge package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=b691248d2f70cdaeeaf13696ada5d47c"

DEPENDS = "actionlib angles catkin-native control-msgs diagnostic-updater message-generation message-runtime rosserial-python sensor-msgs std-msgs std-srvs"
SRC_URI = "https://github.com/ipa320/cob_hand-release/archive/release/kinetic/cob_hand_bridge/0.6.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c6ed2556e74e86b981716a5982cd9b8a"
SRC_URI[sha256sum] = "89dc87049fe5c476a52b99eb05ec65c433812b8e52493313b20b1dd96816dadd"
S = "${WORKDIR}/cob_hand-release-release-kinetic-cob_hand_bridge-0.6.2-0"

inherit catkin
