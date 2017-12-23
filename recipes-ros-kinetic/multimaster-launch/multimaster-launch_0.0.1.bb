# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Multi-master bringup launch files for CPR platforms"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native clock-relay master-discovery-fkie master-sync-fkie message-relay tf2-relay"
SRC_URI = "https://github.com/clearpath-gbp/cpr_multimaster_tools-release/archive/release/kinetic/multimaster_launch/0.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b56c9a292e5fbabe090623cbec9c6a1c"
SRC_URI[sha256sum] = "13f34673d7815a9ff19c831a603906cececba0aa969b734896d449cd9c8b6570"
S = "${WORKDIR}/cpr_multimaster_tools-release-release-kinetic-multimaster_launch-0.0.1-0"

inherit catkin
