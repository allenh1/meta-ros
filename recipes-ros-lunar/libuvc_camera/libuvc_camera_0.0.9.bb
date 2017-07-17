# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "USB Video Class camera driver"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=5fc05f292fb3d252b7a5dab5fe7c4d63"

DEPENDS = "camera_info_manager catkin dynamic_reconfigure image_transport libuvc nodelet roscpp sensor_msgs"
SRC_URI = "https://github.com/ros-drivers-gbp/libuvc_ros-release/archive/release/lunar/libuvc_camera/0.0.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "96dc5c87dbc1f9105660c0902ed7ef85"
SRC_URI[sha256sum] = "31ee066fb3d90432de4b83fc0d7996625a063193eb4eb1e0112fb8e05b7886c8"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
