# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Converts between ROS structures and ViSP structures."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=af83bf5aeecec57b1bce67bfc32592b4"

DEPENDS = "camera_calibration_parsers catkin geometry_msgs roscpp sensor_msgs std_msgs visp"
SRC_URI = "https://github.com/lagadic/vision_visp-release/archive/release/lunar/visp_bridge/0.10.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ae23fb7ac93284ab5a948c99970d4010"
SRC_URI[sha256sum] = "b6df17cc49d961dbe7009da4f87a835193cd10ed8b55af60f06719280e9823a2"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
