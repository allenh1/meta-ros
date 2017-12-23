# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The Kobuki dashboard is a RQT-based plug-in for visualising data from Kobuki and"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native kobuki-msgs rospy rqt-robot-dashboard"
SRC_URI = "https://github.com/yujinrobot-release/kobuki_desktop-release/archive/release/kinetic/kobuki_dashboard/0.5.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8f37703fba7f5b09040c11f82668cdde"
SRC_URI[sha256sum] = "82243a29379e1dd189f170afad371c0cbe6b9ace00cafc2d496c6ff857b91c71"
S = "${WORKDIR}/kobuki_desktop-release-release-kinetic-kobuki_dashboard-0.5.7-0"

inherit catkin
