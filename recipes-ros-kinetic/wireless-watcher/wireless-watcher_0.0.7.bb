# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The wireless_watcher package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native rospy wireless-msgs"
SRC_URI = "https://github.com/clearpath-gbp/wireless-release/archive/release/kinetic/wireless_watcher/0.0.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "53d731ea084bea0af43a4b6a87c27122"
SRC_URI[sha256sum] = "76e7b991c9921a1e911c663ae2aee13644a238ffffc21f77e8f3983adca31de6"
S = "${WORKDIR}/wireless-release-release-kinetic-wireless_watcher-0.0.7-0"

inherit catkin
