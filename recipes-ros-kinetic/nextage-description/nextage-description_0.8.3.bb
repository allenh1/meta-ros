# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "As a part of rtmros_nextage package that is a ROS interface for  dual-armed robo"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native urdf"
SRC_URI = "https://github.com/tork-a/rtmros_nextage-release/archive/release/kinetic/nextage_description/0.8.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a5bfe8e39835fa6837fb56159892315b"
SRC_URI[sha256sum] = "af77741fe8030f26516761fd8007a8e89a3751c3bbdf3ef3d61b7be0be21a53d"
S = "${WORKDIR}/rtmros_nextage-release-release-kinetic-nextage_description-0.8.3-0"

inherit catkin
