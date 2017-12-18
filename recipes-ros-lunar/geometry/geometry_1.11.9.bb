# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "angles catkin-native catkin eigen-conversions kdl-conversions tf tf-conversions"
SRC_URI = "https://github.com/ros-gbp/${PN}-release/archive/release/lunar/${PN}/1.11.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b52b40de57f4ef37d1aded830baf9475"
SRC_URI[sha256sum] = "5cf136d087facac2aadb2762084d398740d762638e55834c0153cbafad52c17c"
S = "${WORKDIR}/${PN}-release-release-lunar-${PN}-1.11.9-0"

inherit catkin
