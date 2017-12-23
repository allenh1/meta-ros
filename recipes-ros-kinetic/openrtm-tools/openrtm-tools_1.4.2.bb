# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The openrtm_tools package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native openrtm-aist openrtm-aist-python rosbash rostest rtshell"
SRC_URI = "https://github.com/tork-a/rtmros_common-release/archive/release/kinetic/openrtm_tools/1.4.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "cb4d3ee0f8b028d9b8218791a6b0fe15"
SRC_URI[sha256sum] = "2357067dfe93be5ed3bdadd4b28e08f39aa6bb5002b7c3aa75090e9e54cb6803"
S = "${WORKDIR}/rtmros_common-release-release-kinetic-openrtm_tools-1.4.2-0"

inherit catkin
