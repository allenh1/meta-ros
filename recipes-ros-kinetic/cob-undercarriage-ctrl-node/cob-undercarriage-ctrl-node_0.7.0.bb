# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "cob_undercarriage_ctrl_node implements a controller for the omnidirectional base"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native cob-msgs cob-omni-drive-controller control-msgs diagnostic-msgs diagnostic-updater geometry-msgs nav-msgs roscpp tf urdf"
SRC_URI = "https://github.com/ipa320/cob_control-release/archive/release/kinetic/cob_undercarriage_ctrl_node/0.7.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a26e37b9b5b0ccc31dd6e20efc3e4b52"
SRC_URI[sha256sum] = "454f980f45dbf5a8d348d420ba7cff00f4168e5501ec4d937c4387acfc54e739"
S = "${WORKDIR}/cob_control-release-release-kinetic-cob_undercarriage_ctrl_node-0.7.0-0"

inherit catkin
