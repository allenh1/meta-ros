# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "RTAB-Map's standalone library. RTAB-Map is a RGB-D SLAM approach with real-time "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cmake cv-bridge libfreenect-dev libopenni-dev libpcl-all-dev libsqlite3-dev libvtk-qt octomap proj qt-gui-cpp zlib"
SRC_URI = "https://github.com/introlab/${PN}-release/archive/release/lunar/${PN}/0.13.2-3.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0b0bd19a4ad1233e99ccec40d9ab51bf"
SRC_URI[sha256sum] = "adc58cdccfb7b985a3ab3edb60db5cf92f6f1ca8972fa476d407c96938edd789"
S = "${WORKDIR}/${PN}-release-release-lunar-${PN}-0.13.2-3"

inherit catkin
