# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "RTAB-Map's standalone library. RTAB-Map is a RGB-D SLAM approach with real-time "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cmake cv-bridge libfreenect-dev libopenni-dev libpcl-all-dev libsqlite3-dev libvtk-qt octomap proj qt-gui-cpp zlib"
SRC_URI = "https://github.com/introlab/${PN}-release/archive/release/kinetic/${PN}/0.11.13-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4eb8bdc045c6a329befad057037b54af"
SRC_URI[sha256sum] = "44e43db8afa55e5e1dce495301a6c7677b4dfa11fd5ca2ccdbebf92ce2954ac9"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-0.11.13-0"

inherit catkin
