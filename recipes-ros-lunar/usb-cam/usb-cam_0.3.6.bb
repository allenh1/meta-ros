# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A ROS Driver for V4L USB Cameras"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "camera-info-manager catkin-native ffmpeg image-transport roscpp sensor-msgs std-msgs std-srvs v4l-utils"
SRC_URI = "https://github.com/ros-gbp/usb_cam-release/archive/release/lunar/usb_cam/0.3.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ae39333c76f1246b6c62fe1a6e7b6ea4"
SRC_URI[sha256sum] = "b1a8ad230eda5595d82de4fcade00e96737a747768e0019d52c4704ea4dbfdf0"
S = "${WORKDIR}/usb_cam-release-release-lunar-usb_cam-0.3.6-0"

inherit catkin
