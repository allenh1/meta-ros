# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "driver for the KUKA youBot robot"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=5ffa7541a1d64de2885ae1941dd172d9"

DEPENDS = "catkin-native rosconsole roscpp"
SRC_URI = "https://github.com/youbot-release/youbot_driver-release/archive/release/kinetic/youbot_driver/1.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8e88523b1c2f7641d7087de81279498d"
SRC_URI[sha256sum] = "a30d432375ee3f192925307a43c2af9003868601cac799811351cfde4c910470"
S = "${WORKDIR}/youbot_driver-release-release-kinetic-youbot_driver-1.1.0-0"

inherit catkin
