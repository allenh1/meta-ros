# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Multi-master tools for configuration and message relaying"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native clock-relay message-relay multimaster-launch multimaster-msgs tf2-relay"
SRC_URI = "https://github.com/clearpath-gbp/cpr_multimaster_tools-release/archive/release/kinetic/cpr_multimaster_tools/0.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4645655884f55933c8b10abc2bfb01af"
SRC_URI[sha256sum] = "5eedbb275f29e11aad06c2b301c2788982eea7141a4e0ad23e313ce428a9c4f4"
S = "${WORKDIR}/cpr_multimaster_tools-release-release-kinetic-cpr_multimaster_tools-0.0.1-0"

inherit catkin
