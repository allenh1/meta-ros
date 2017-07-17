# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "image_geometry contains C++ and Python libraries for interpreting images
    geo"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=d4590eee0c8ca094dde629ef76bc17ed"

DEPENDS = "catkin opencv3 sensor_msgs"
SRC_URI = "https://github.com/ros-gbp/vision_opencv-release/archive/release/lunar/image_geometry/1.12.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d702e6f0e74b4c776daa4293944b3749"
SRC_URI[sha256sum] = "59c39e8b50ea3f3b431d8f3778b293db33c71aeff2fab5edc35ce37051d75a66"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
