# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The cob_control_mode_adapter package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin-native controller-manager-msgs roscpp roslint std-msgs"
SRC_URI = "https://github.com/ipa320/cob_control-release/archive/release/kinetic/cob_control_mode_adapter/0.7.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8802422026ac79235b01c0a8a4773f07"
SRC_URI[sha256sum] = "28a1e13f4c89f2b1dd70f7d242b02e80d6f045281e52290da68010354de12365"
S = "${WORKDIR}/cob_control-release-release-kinetic-cob_control_mode_adapter-0.7.0-0"

inherit catkin
