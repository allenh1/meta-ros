# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Core rocon apps for use with the appmanager and rocon concert."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native gateway-msgs rocon-app-manager-msgs roslib rospy rospy-tutorials topic-tools"
SRC_URI = "https://github.com/yujinrobot-release/rocon_app_platform-release/archive/release/kinetic/rocon_apps/0.9.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f5e8a357325fef17f4bcdbb685c1d310"
SRC_URI[sha256sum] = "562a60b4db8f346a1265edcdaf6004996e7489d3c49070e10980ba5265332c2c"
S = "${WORKDIR}/rocon_app_platform-release-release-kinetic-rocon_apps-0.9.1-0"

inherit catkin
