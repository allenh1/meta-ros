# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The summit_xl_pad package allows to control the summit_xl product range (summit_"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native diagnostic-updater geometry-msgs message-generation message-runtime robotnik-msgs roscpp sensor-msgs"
SRC_URI = "https://github.com/RobotnikAutomation/summit_xl_common-release/archive/release/kinetic/summit_xl_pad/1.1.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "738b37b3dc41e2f021f4476818d6e99f"
SRC_URI[sha256sum] = "397414a554081a003547e7225887b5e71ac82e3c8c17817faf6cb456c56a58df"
S = "${WORKDIR}/summit_xl_common-release-release-kinetic-summit_xl_pad-1.1.2-0"

inherit catkin
