# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "3D visualization tool for ROS."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSDCreative Commons"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "assimp assimp-dev catkin cmake_modules eigen geometry_msgs image_transport interactive_markers laser_geometry libogre-dev libqt5-core libqt5-gui libqt5-opengl libqt5-opengl-dev libqt5-widgets liburdfdom-headers-dev map_msgs media_export message_filters nav_msgs opengl pluginlib python_qt_binding qtbase5-dev resource_retriever rosbag rosconsole roscpp roslib rospy sensor_msgs std_msgs std_srvs tf tinyxml urdf visualization_msgs yaml-cpp"
SRC_URI = "https://github.com/ros-gbp/rviz-release/archive/release/lunar/rviz/1.12.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "84e6fd4223ca9e56f44ed709aa0010a2"
SRC_URI[sha256sum] = "6505a6d518592469d22e2d1b800d85b2f2fa17acfcbc4b048295425e8d480beb"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
