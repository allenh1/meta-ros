# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Converts between ROS structures and ViSP structures."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=fe8b75cf0aba647401e1038bcd69ee74"

DEPENDS = "camera-calibration-parsers catkin-native geometry-msgs roscpp sensor-msgs std-msgs visp"
SRC_URI = "https://github.com/lagadic/vision_visp-release/archive/release/lunar/visp_bridge/0.10.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ae23fb7ac93284ab5a948c99970d4010"
SRC_URI[sha256sum] = "b6df17cc49d961dbe7009da4f87a835193cd10ed8b55af60f06719280e9823a2"
S = "${WORKDIR}/vision_visp-release-release-lunar-visp_bridge-0.10.0-1"

inherit catkin
