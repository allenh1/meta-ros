# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "cob_dashboard is a modified version of [[pr2_dashboard]]."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native cob-msgs roslib rospy rqt-gui rqt-robot-dashboard"
SRC_URI = "https://github.com/ipa320/cob_command_tools-release/archive/release/kinetic/cob_dashboard/0.6.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4b9d45206ffac9338219982bc904a875"
SRC_URI[sha256sum] = "fe5f54464130f225184fa8b6faaf0b87ed1596696708cbb9b79b16d981ee0dd0"
S = "${WORKDIR}/cob_command_tools-release-release-kinetic-cob_dashboard-0.6.6-0"

inherit catkin
