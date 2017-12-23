# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Converts between ROS structures and ViSP structures."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=fe8b75cf0aba647401e1038bcd69ee74"

DEPENDS = "camera-calibration-parsers catkin-native geometry-msgs roscpp sensor-msgs std-msgs visp"
SRC_URI = "https://github.com/lagadic/vision_visp-release/archive/release/kinetic/visp_bridge/0.10.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2732e7ea9efc12dbf71e0edc8218b889"
SRC_URI[sha256sum] = "191d59fb2ee63011ac734f82d6e451c4e87a06827c42e9200cbf7b8584cb7098"
S = "${WORKDIR}/vision_visp-release-release-kinetic-visp_bridge-0.10.0-0"

inherit catkin
