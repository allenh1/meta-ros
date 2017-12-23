# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rosping is the tool to send ICMP ECHO_REQUEST to network hosts where roscore is "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Boost-1.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d98785270c85a483b5697dfd09b5f41a"

DEPENDS = "catkin-native mk rosboost-cfg rosbuild roscpp rostest std-msgs"
SRC_URI = "https://github.com/tork-a/jsk_3rdparty-release/archive/release/kinetic/${PN}/2.1.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f1a501dce0c8148fede7c61cbb75cb40"
SRC_URI[sha256sum] = "84085aa2d2fc9c8554d39ce606e22f53524b6876132ba4047e8a2d4ab520cda4"
S = "${WORKDIR}/jsk_3rdparty-release-release-kinetic-${PN}-2.1.6-0"

inherit catkin
