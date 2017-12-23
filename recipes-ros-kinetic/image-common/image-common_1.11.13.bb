# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Common code for working with images in ROS."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "camera-calibration-parsers camera-info-manager catkin-native image-transport polled-camera"
SRC_URI = "https://github.com/ros-gbp/image_common-release/archive/release/kinetic/image_common/1.11.13-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "559a9f3999f26c3fcb5ae3e1794e513c"
SRC_URI[sha256sum] = "2d847bf4cd08c9c1ba3f7ec9708b6a50735668a321a47e0d0a26c02157e0896d"
S = "${WORKDIR}/image_common-release-release-kinetic-image_common-1.11.13-0"

inherit catkin
