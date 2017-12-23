# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rosserial for Windows platforms."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs message-runtime nav-msgs rospy rosserial-client rosserial-msgs sensor-msgs std-msgs"
SRC_URI = "https://github.com/ros-gbp/rosserial-release/archive/release/kinetic/rosserial_windows/0.7.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "90a1cae0c87c0e25795fe235f23ff678"
SRC_URI[sha256sum] = "fe34cfdd30aef596edd2de90da2cc3dfe335bac7e1d80fd9c4037883c2726d86"
S = "${WORKDIR}/rosserial-release-release-kinetic-rosserial_windows-0.7.7-0"

inherit catkin
