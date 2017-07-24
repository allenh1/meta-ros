# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Compressed_depth_image_transport provides a plugin to image_transport for transp"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python-empy-native cv-bridge dynamic-reconfigure image-transport"
SRC_URI = "https://github.com/ros-gbp/image_transport_plugins-release/archive/release/lunar/compressed_depth_image_transport/1.9.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c9a789c5b7873c54f4ee68d30348de4b"
SRC_URI[sha256sum] = "9308c916b9628f1818081862ca92916e14f65312a185a489d14b02529f13c258"
S = "${WORKDIR}/image_transport_plugins-release-release-lunar-compressed_depth_image_transport-1.9.5-0"

inherit catkin
