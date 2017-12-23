# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_multiplot provides a GUI plugin for visualizing numeric values     in multip"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-1"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=146ba316845cfe6058c8baebd902a726"

DEPENDS = "catkin-native libqwt6 rosbag roscpp rqt-gui rqt-gui-cpp variant-topic-tools"
SRC_URI = "https://github.com/ethz-asl/rqt_multiplot_plugin-release/archive/release/kinetic/rqt_multiplot/0.0.7-2.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2ac3561600a904a8c944b1b979f02e66"
SRC_URI[sha256sum] = "06f48f7bd4a6ba552c7f8c33363a2b4621e082dbdf18103e2b8e96e76a47e680"
S = "${WORKDIR}/rqt_multiplot_plugin-release-release-kinetic-rqt_multiplot-0.0.7-2"

inherit catkin
