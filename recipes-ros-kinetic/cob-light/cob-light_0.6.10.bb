# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains scripts to operate the LED lights on Care-O-bot."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "actionlib actionlib-msgs boost catkin-native diagnostic-msgs message-generation message-runtime roscpp rospy sensor-msgs std-msgs visualization-msgs"
SRC_URI = "https://github.com/ipa320/cob_driver-release/archive/release/kinetic/cob_light/0.6.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a42aa43fa4f683e6b40690df48b66c76"
SRC_URI[sha256sum] = "08c412e308f3743944b9f13ed669fe6a7b480158c040a8e7b350cdc444c7122e"
S = "${WORKDIR}/cob_driver-release-release-kinetic-cob_light-0.6.10-0"

inherit catkin
