# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "cob_control meta-package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native cob-base-velocity-smoother cob-cartesian-controller cob-collision-velocity-filter cob-control-mode-adapter cob-control-msgs cob-footprint-observer cob-frame-tracker cob-model-identifier cob-obstacle-distance cob-omni-drive-controller cob-trajectory-controller cob-twist-controller cob-undercarriage-ctrl-node"
SRC_URI = "https://github.com/ipa320/cob_control-release/archive/release/kinetic/cob_control/0.7.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "59fda71a596a67b674df4178ddf1c89f"
SRC_URI[sha256sum] = "9b6893fb1a724b8eeda92dbd335cc8e047f0edd86a10954aa9e4cfc70a02929e"
S = "${WORKDIR}/cob_control-release-release-kinetic-cob_control-0.7.0-0"

inherit catkin
