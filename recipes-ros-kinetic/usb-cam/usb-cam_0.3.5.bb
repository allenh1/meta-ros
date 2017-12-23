# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A ROS Driver for V4L USB Cameras"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "camera-info-manager catkin-native ffmpeg image-transport roscpp sensor-msgs std-msgs std-srvs v4l-utils"
SRC_URI = "https://github.com/ros-gbp/usb_cam-release/archive/release/kinetic/usb_cam/0.3.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8ec63bc8d7facc336e3c5284fe647fcb"
SRC_URI[sha256sum] = "43d0e60d5ed77191015411fbf3d0485f34dc2e2f6d3c60fc574f25c587c7c06b"
S = "${WORKDIR}/usb_cam-release-release-kinetic-usb_cam-0.3.5-0"

inherit catkin
