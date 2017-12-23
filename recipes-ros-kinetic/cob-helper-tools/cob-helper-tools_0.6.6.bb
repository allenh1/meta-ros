# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Helper scripts for Care-O-bot"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native cob-msgs cob-script-server diagnostic-msgs rospy tf visualization-msgs"
SRC_URI = "https://github.com/ipa320/cob_command_tools-release/archive/release/kinetic/cob_helper_tools/0.6.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ff75a126364c9a8bf11cf95e6322276e"
SRC_URI[sha256sum] = "e4a43683fcdcbf614140547b66a6550dfc6a0e72ec173d85de7eba87d60aa016"
S = "${WORKDIR}/cob_command_tools-release-release-kinetic-cob_helper_tools-0.6.6-0"

inherit catkin
