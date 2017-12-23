# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "multires_image"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native libopencv-dev libqt5-core libqt5-gui libqt5-opengl libqt5-opengl-dev libqt5-widgets mapviz pluginlib roscpp swri-math-util swri-transform-util swri-yaml-util tf"
SRC_URI = "https://github.com/swri-robotics-gbp/mapviz-release/archive/release/kinetic/multires_image/0.2.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9b3a3479ae6ad8fc69fb4b81e885ab28"
SRC_URI[sha256sum] = "0384834bea18a25d1ab447ad2091db0c6f613c571b818c215548fd797d85c7be"
S = "${WORKDIR}/mapviz-release-release-kinetic-multires_image-0.2.4-0"

inherit catkin
