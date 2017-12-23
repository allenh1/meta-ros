# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native jsk-interactive jsk-interactive-marker jsk-interactive-test jsk-rqt-plugins jsk-rviz-plugins"
SRC_URI = "https://github.com/tork-a/jsk_visualization-release/archive/release/kinetic/jsk_visualization/2.1.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4a648f06430c0a9fbd7a81bfa69c38e1"
SRC_URI[sha256sum] = "6591420db63d9b2ed33165c6b178b2780d530b12a8462a696756198bc4a647de"
S = "${WORKDIR}/jsk_visualization-release-release-kinetic-jsk_visualization-2.1.1-0"

inherit catkin
