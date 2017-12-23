# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Tile map provides a slippy map style interface for visualizing       OpenStreetM"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native libjsoncpp libjsoncpp-dev libqt5-core libqt5-gui libqt5-network libqt5-opengl libqt5-opengl-dev libqt5-widgets mapviz pluginlib roscpp swri-math-util swri-transform-util swri-yaml-util tf"
SRC_URI = "https://github.com/swri-robotics-gbp/mapviz-release/archive/release/kinetic/tile_map/0.2.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5351bca2f37ed7086a84f09def61c8ec"
SRC_URI[sha256sum] = "760aba98cce18ca04fc2d1acd8f787c3df63b4b780092cf3eb4777f09a9e505f"
S = "${WORKDIR}/mapviz-release-release-kinetic-tile_map-0.2.4-0"

inherit catkin
