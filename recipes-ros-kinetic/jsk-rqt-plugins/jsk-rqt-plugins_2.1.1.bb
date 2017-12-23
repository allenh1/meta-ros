# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The jsk_rqt_plugins package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cv-bridge image-view2 message-generation message-runtime mk python-urlgrabber qt-gui-py-common resource-retriever rosbuild rqt-gui rqt-gui-py rqt-image-view rqt-plot"
SRC_URI = "https://github.com/tork-a/jsk_visualization-release/archive/release/kinetic/jsk_rqt_plugins/2.1.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3aafe92493f487c9fa6b02dac4f9fba6"
SRC_URI[sha256sum] = "68d5e586727bd9571f0e9249595b9fda682c47e54cd3e15c0d743c52b6ca0348"
S = "${WORKDIR}/jsk_visualization-release-release-kinetic-jsk_rqt_plugins-2.1.1-0"

inherit catkin
