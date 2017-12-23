# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_plot provides a GUI plugin visualizing numeric values in a 2D plot using dif"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native python-matplotlib python-numpy python-rospkg python-qt-binding qt-gui-py-common qwt-dependency rosgraph rostopic rqt-gui rqt-gui-py rqt-py-common std-msgs"
SRC_URI = "https://github.com/ros-gbp/rqt_plot-release/archive/release/kinetic/rqt_plot/0.4.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0256539195b9cd8eb8b8e01f2207e8f7"
SRC_URI[sha256sum] = "a5af60dcd95878b5b9cb7c8195cecc9d7ecd88f1666ed22662d6d325acebaf9b"
S = "${WORKDIR}/rqt_plot-release-release-kinetic-rqt_plot-0.4.8-0"

inherit catkin
