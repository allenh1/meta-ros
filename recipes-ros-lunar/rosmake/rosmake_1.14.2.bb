# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rosmake is a ros dependency aware build tool which can be used to      build all"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native python-rospkg"
SRC_URI = "https://github.com/ros-gbp/ros-release/archive/release/lunar/${PN}/1.14.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6e31219009a3f440357c136f23977ddb"
SRC_URI[sha256sum] = "a71c200e2b64adb18d5ca0b71c4d53864a91e3c78100c54ffba2a099994aa185"
S = "${WORKDIR}/ros-release-release-lunar-${PN}-1.14.2-0"

inherit catkin
