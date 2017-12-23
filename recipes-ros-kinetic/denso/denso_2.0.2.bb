# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native denso-launch denso-ros-control vs060 vs060-gazebo vs060-moveit-config"
SRC_URI = "https://github.com/start-jsk/${PN}-release/archive/release/kinetic/${PN}/2.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "066a3d017b4fbb2bcc48c16e6b32bc66"
SRC_URI[sha256sum] = "46b2add56881512a8d13d951e8d4d5591209d4d73744f5a6adbcdbe4c7f5beb3"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-2.0.2-0"

inherit catkin
